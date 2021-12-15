import cats.effect.{ExitCode, IO, IOApp}
import tofu.Start

object MyExample extends IOApp{
  override def run(args: List[String]): IO[ExitCode] = {
    val start = implicitly[Start[IO]]
    start.start(IO.apply({println("hello"); println(start.toString)})).unsafeRunSync()
    IO.apply(ExitCode.Success)
  }
}
