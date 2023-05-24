package garsemar.botTN

import kotlin.io.path.Path
import kotlin.io.path.listDirectoryEntries

fun main() {
    val files = Path("src/main/kotlin/garsemar/categories").listDirectoryEntries().sortedBy { it.fileName.toString().split(" ")[0].toInt() }

    files.forEach {
        // delete blank items
        val file = it.fileName.toString().split(" ").filter { it != "" }
        val pos = file[0]

        val name = file.drop(1).joinToString("_").replace(",", "")

        val newName = "$pos $name"

        println(newName)
        it.toFile().renameTo(Path("src/main/kotlin/garsemar/categories/$newName").toFile())
    }
}