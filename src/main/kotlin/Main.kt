fun main() {
    val mb = 1024 * 1024
    val runtime = Runtime.getRuntime()

    println("Used Memory: ${(runtime.totalMemory() - runtime.freeMemory()) / mb}MiB")
    println("Free Memory: ${runtime.freeMemory() / mb}MiB")
    println("Total Memory: ${runtime.totalMemory() / mb}MiB")
    println("Max Memory: ${runtime.maxMemory() / mb}MiB")
    println("Available Processors: ${Runtime.getRuntime().availableProcessors()}")
}