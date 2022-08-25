import mill.{T, _}
import mill.scalalib._
import mill.scalalib.publish.{Developer, License, PomSettings, VersionControl}

object `core-adts` extends ScalaModule with PublishModule {

  def scalaVersion = "2.13.8"

  override def sources = T.sources { millSourcePath / os.up / "adts" }

  override def pomSettings = {
    PomSettings(
      description = "core adts",
      organization = "com.logicovercode",
      url = "https://github.com/techLeadAtLogicOverCode/core-adts",
      licenses = Seq(License.MIT),
      versionControl = VersionControl.github("techLeadAtLogicOverCode", "core-adts"),
      developers = Seq(
        Developer("techlead", "techlead", "https://github.com/techLeadAtLogicOverCode")
      )
    )
  }

  override def publishVersion = "0.0.001"
}