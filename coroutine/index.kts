import kotlin.coroutines.runBlocking
import kotlin.coroutines.delay

Thread(Runnable {
    for(i in 1..10) {
        Thread.sleep(1000L)
        print("I'm working in Thread.")
    }
}).start()

GlobalScope.launch() {
    runBlocking {
        print("I'm working in Coroutine.")
        delay(200L)
        print("done")
    }
}