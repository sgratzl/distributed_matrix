import java.util.concurrent.LinkedBlockingDeque
import scala.concurrent.Promise


package object tasks {
  type TaskQueue = LinkedBlockingDeque[Task]

  case class Task(uid: Int, args: AnyRef, promise: Promise[AnyRef])

  object Task {
    def apply(uid: Int, args: AnyRef): Task = Task(uid, args, null.asInstanceOf[Promise[AnyRef]])
  }
}