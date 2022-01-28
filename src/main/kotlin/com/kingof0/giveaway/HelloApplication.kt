package com.kingof0.giveaway

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage
import java.io.File
import java.io.FileWriter

class HelloApplication : Application() {

    override fun start(stage: Stage) {

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        stage.title = "Zeyd!"
        stage.scene = scene


        stage.show()
    }

}

val file = File("data.txt")
val writer = FileWriter(file)

fun main() {
    if (!file.exists()) {
        file.createNewFile()
    }

    Application.launch(HelloApplication::class.java)
}