data class Book(val name: String = "", val price: Int = 0)

fun main(args: Array<String>) {
    var books: ArrayList<Book> = ArrayList()
    books.add(Book("Khaing,I shall call you friend", 5000))
    books.add(Book("Php complete learning", 10000))

    for (book in books) {
        println("${book.name}=${book.price}")
    }

}