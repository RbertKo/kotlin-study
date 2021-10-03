Thread(Runnable {
    for(i in 1..10) {
        Thread.sleep(1000L)
        print("I'm working in Thread.")
    }
}).start()

GlobalScope.launch() {
    repeat(10) {
        delay(1000L)
        print("I'm working in Coroutine.")
    }
}