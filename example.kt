fun main() {
    // Printing the counties on indices 0 & 2
    var counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")
    for (index in counties.indices) {
        if (index == 0 || index == 2) {
            print("${counties[index]} ")
        }
    }
}