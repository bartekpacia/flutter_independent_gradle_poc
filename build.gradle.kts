import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

tasks.register("optimizeAssets") {
    group = "Custom"
    description = "Generates optimized variants of /assets"

    doLast {
        logger.quiet("Generating optimized assets")
    }
}

tasks.register("updateL10n") {
    group = "Custom"
    description = "Updates localization files"

    doLast {
        val url = URL("https://jsonplaceholder.typicode.com/todos/1")
        val conn = url.openConnection() as HttpURLConnection
        conn.requestMethod = "GET"

        BufferedReader(InputStreamReader(conn.inputStream)).use { br ->
            var line: String?
            while (br.readLine().also { line = it } != null) {
                println(line)
            }
        }
    }
}
