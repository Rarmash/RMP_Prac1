import java.time.LocalDate

class Expense {
    private val expenseAmount: Double
    private val category: String
    private val date: LocalDate

    constructor(expenseAmount: Double, category: String, date: LocalDate) {
        this.expenseAmount = expenseAmount
        this.category = category
        this.date = date
    }

    fun displayInfo() {
        println("Сумма расхода: $expenseAmount\nКатегория: $category\nДата: $date")
    }

    fun getCategory(): String {
        return category
    }

    fun getExpenseAmount(): Double {
        return expenseAmount
    }
}