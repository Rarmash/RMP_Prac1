class ExpensesList {
    private val expensesList: MutableList<Expense> = mutableListOf()

    fun addExpense(expense: Expense) {
        expensesList.add(expense)
        println("Расход добавлен: ${expense.getCategory()} - ${expense.getExpenseAmount()}")
        println("---")
    }

    fun printExpenses() {
        if (expensesList.isEmpty()) {
            println("Список пуст")
            println("---")
        } else {
            println("Список расходов:")
            expensesList.forEach { it.displayInfo() }
            println("---")
        }
    }

    private fun getTotalByCategory(): Map<String, Double> {
        return expensesList.groupBy { it.getCategory() }
            .mapValues { entry -> entry.value.sumOf { it.getExpenseAmount() } }
    }

    fun printTotalByCategory() {
        val totals = getTotalByCategory()
        if (totals.isEmpty()) {
            println("Расходы отсутствуют.")
            println("---")
        } else {
            println("Сумма расходов по категориям:")
            totals.forEach { (category, total) ->
                println("Категория: $category, Сумма: $total")
            }
            println("---")
        }
    }
}