package com.kingof0.giveaway

import javafx.fxml.FXML
import javafx.scene.control.TextField

class HelloController {

    @FXML
    private lateinit var text: TextField

    @FXML
    private fun onTextAdd() {
        writer.appendLine(text.text)
        writer.flush()
    }
}