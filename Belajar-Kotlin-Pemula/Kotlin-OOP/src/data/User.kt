package src.data

/**
 * Note: Properties Construstor hanya bisa diguanakan pada primary constructor
 */
class User(var username: String, var password: String) {
    override fun toString(): String {
        return "User with username = $username"
    }
}