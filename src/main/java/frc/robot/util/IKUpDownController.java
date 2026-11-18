// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.GenericHID;

/** A custom utility wrapper to handle keyboard inputs as a GenericHID for simulation. */
public class IKUpDownController extends GenericHID {
    public IKUpDownController(int port) {
        super(port);
    }
    
    /**
     * IK - Axis 0
     * Up/Down - Axis 1
     * UOJL - Buttons 1 through 4 (2026)
     * 
     * To make buttons correspond to a joystick, you must edit the values
     * within simgui-ds.json. The values for 2027 of each key correspond to those
     * found at https://oprypin.github.io/crystal-imgui/ImGui/ImGuiKey.html
     * 
     * The values for 2026 correspond to
     * https://learn.microsoft.com/en-us/windows/win32/inputdev/virtual-key-codes
     */

    public boolean getUButtonPressed() {
        return this.getRawButtonPressed(1);
    }
    
    public boolean getUButton() {
        return this.getRawButton(1);
    }

    public boolean getUButtonReleased() {
        return this.getRawButtonReleased(1);
    }

    public boolean getOButtonPressed() {
        return this.getRawButtonPressed(2);
    }
    
    public boolean getOButton() {
        return this.getRawButton(2);
    }

    public boolean getOButtonReleased() {
        return this.getRawButtonReleased(2);
    }

    public boolean getJButtonPressed() {
        return this.getRawButtonPressed(2);
    }
    
    public boolean getJButton() {
        return this.getRawButton(3);
    }

    public boolean getJButtonReleased() {
        return this.getRawButtonReleased(3);
    }

    public boolean getLButtonPressed() {
        return this.getRawButtonPressed(4);
    }
    
    public boolean getLButton() {
        return this.getRawButton(4);
    }

    public boolean getLButtonReleased() {
        return this.getRawButtonReleased(4);
    }

    public double getIKAxis() {
        return this.getRawAxis(0);
    }

    public double getUpDownAxis() {
        return this.getRawAxis(1);
    }
}