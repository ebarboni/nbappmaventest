/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wrapper1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "File",
        id = "com.mycompany.wrapper1.DummyAction"
)
@ActionRegistration(
        displayName = "#CTL_DummyAction"
)
@ActionReference(path = "Menu/File", position = 2700, separatorBefore = 2650)
@Messages("CTL_DummyAction=Wrapper 1 Action")
public final class DummyAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
