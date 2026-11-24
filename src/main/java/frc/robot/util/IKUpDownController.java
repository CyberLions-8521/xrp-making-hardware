// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.GenericHID;

/**
 * A custom utility wrapper to handle keyboard inputs as a GenericHID for simulation.
 *
 * <p>Mimics a left and right joystick that can only move up and down, using {@code IK} and the
 * {@code Up/Down} Arrow keys as axes, and {@code UOJL} as buttons (suggested for tank-style
 * driving).
 */
public class IKUpDownController extends GenericHID {
    /**
     * Creates an IK/Up-Down keyboard controller on the given port (0 - 5).
     *
     * @param port The port number for the controller (0 - 5).
     */
    public IKUpDownController(int port) {
        super(port);
    }

    /*
     * IK - Axis 0
     * Up/Down - Axis 1
     * UOJL - Buttons 1 through 4 (2026)
     *
     * To make buttons correspond to a joystick, you must edit the values
     * within simgui-ds.json. The values for 2027 of each key correspond to those
     * found at https://oprypin.github.io/crystal-imgui/ImGui/ImGuiKey.html
     *
     * The values for 2026 correspond to
     * https://www.glfw.org/docs/3.3/group__keys.html
     */

    /**
     * Checks whether the U button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the U key is pressed down.
     */
    public boolean getUButtonPressed() {
        return this.getRawButtonPressed(1);
    }

    /**
     * Reads the state of the U button on the controller.
     *
     * @return {@code true} as long as the U key is held down.
     */
    public boolean getUButton() {
        return this.getRawButton(1);
    }

    /**
     * Checks whether the U button was released since the last check.
     *
     * @return {@code true} only at the time when the U key is released.
     */
    public boolean getUButtonReleased() {
        return this.getRawButtonReleased(1);
    }

    /**
     * Checks whether the O button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the O key is pressed down.
     */
    public boolean getOButtonPressed() {
        return this.getRawButtonPressed(2);
    }

    /**
     * Reads the state of the O button on the controller.
     *
     * @return {@code true} as long as the O key is held down.
     */
    public boolean getOButton() {
        return this.getRawButton(2);
    }

    /**
     * Checks whether the O button was released since the last check.
     *
     * @return {@code true} only at the time when the O key is released.
     */
    public boolean getOButtonReleased() {
        return this.getRawButtonReleased(2);
    }

    /**
     * Checks whether the J button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the J key is pressed down.
     */
    public boolean getJButtonPressed() {
        return this.getRawButtonPressed(2);
    }

    /**
     * Reads the state of the J button on the controller.
     *
     * @return {@code true} as long as the J key is held down.
     */
    public boolean getJButton() {
        return this.getRawButton(3);
    }

    /**
     * Checks whether the J button was released since the last check.
     *
     * @return {@code true} only at the time when the J key is released.
     */
    public boolean getJButtonReleased() {
        return this.getRawButtonReleased(3);
    }

    /**
     * Checks whether the L button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the L key is pressed down.
     */
    public boolean getLButtonPressed() {
        return this.getRawButtonPressed(4);
    }

    /**
     * Reads the state of the L button on the controller.
     *
     * @return {@code true} as long as the L key is held down.
     */
    public boolean getLButton() {
        return this.getRawButton(4);
    }

    /**
     * Checks whether the L button was released since the last check.
     *
     * @return {@code true} only at the time when the L key is released.
     */
    public boolean getLButtonReleased() {
        return this.getRawButtonReleased(4);
    }

    /**
     * Gets the I/K axis value of the controller (Axis 0).
     *
     * @return The axis value for I / K keys ({@code -1.0} to {@code 1.0}).
     */
    public double getIKAxis() {
        return this.getRawAxis(0);
    }

    /**
     * Gets the Up/Down axis value of the controller (Axis 1).
     *
     * @return The axis value for Up Arrow / Down Arrow keys ({@code -1.0} to {@code 1.0}).
     */
    public double getUpDownAxis() {
        return this.getRawAxis(1);
    }
}