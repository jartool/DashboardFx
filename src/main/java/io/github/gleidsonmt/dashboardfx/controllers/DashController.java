/*
 *    Copyright (C) Gleidson Neves da Silveira
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.gleidsonmt.dashboardfx.controllers;

import io.github.gleidsonmt.dashboardfx.core.app.services.Context;
import io.github.gleidsonmt.dashboardfx.core.app.view_wrapper.ActionView;
import io.github.gleidsonmt.dashboardfx.core.app.view_wrapper.ResponsiveView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Gleidson Neves da Silveira | gleidisonmt@gmail.com
 * Create on  04/10/2022
 */
public final class DashController extends ResponsiveView implements ActionView, Initializable {

    public Label lblCustom;
    private String text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text = lblCustom.getText();
    }

    @Override
    public void onEnter(Context context) {
    }

    @Override
    public void onExit(Context context) {

    }

    @Override
    public void onInit(Context context) {

    }

    @FXML
    private void createSnackSuccess() {
//
//        context.getDecorator()
//                .getRoot()
//                .createSnackBar()
//                .message("My Snack Succes")
//                .undo(event -> {
//                    lblCustom.setText(text);
//                })
//                .icon(Material.PERSON_ADD)
//                .color(SnackColors.SUCCESS)
//                .show();
    }

    @FXML
    private  void createSnackDanger() {
        lblCustom.setText("Created by danger");
//        context.getDecorator()
//                .getRoot()
//                .createSnackBar()
//                .message("My Dangerous Succes")
//                .undo(event -> {
//                    System.out.println("Event from snack");
//                })
//                .icon(Material.INFO)
//                .color(SnackColors.INFO)
//                .showOnTop();
    }

    @FXML
    private void createAlert(){
//        context.getDecorator().getRoot()
//                .getWrapper()
//                .getAlert()
////                .type(AlertType.WARNING)
////                .text("There's no tomorrow rock balboa.")
//                .title("Test in title")
//                .show();
//
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.getButtonTypes().add(ButtonType.APPLY);
    }
}
