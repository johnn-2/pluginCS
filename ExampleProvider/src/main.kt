fun main() {
    val url = "https://recloudstream.github.io/devs/scraping/"
    val response = khttp.get(url)
    println(response.text)
}