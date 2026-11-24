// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

import edu.wpi.first.wpilibj.GenericHID;

/**
 * A custom utility wrapper to handle keyboard inputs as a GenericHID for simulation.
 *
 * <p>Mimics a left and right joystick, with the left having up/down movement ({@code WS}) and the
 * right having left/right movement ({@code Left/Right} Arrow keys), using {@code ZXCV} as buttons.
 */
public class WSLeftRightController extends GenericHID {
    /**
     * Creates a WS/Left-Right keyboard controller on the given port (0 - 5).
     *
     * @param port The port number for the controller (0 - 5).
     */
    public WSLeftRightController(int port) {
        super(port);
    }

    /*
     * WS - Axis 0
     * Left/Right - Axis 1
     * ZXCV - Buttons 1 through 4 (2026)
     *
     * To make buttons correspond to a joystick, you must edit the values
     * within simgui-ds.json. The values for 2027 of each key correspond to those
     * found at https://oprypin.github.io/crystal-imgui/ImGui/ImGuiKey.html
     *
     * The values for 2026 correspond to
     * https://www.glfw.org/docs/3.3/group__keys.html
     */

    /**
     * Checks whether the Z button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the Z key is pressed down.
     */
    public boolean getZButtonPressed() {
        return this.getRawButtonPressed(1);
    }

    /**
     * Reads the state of the Z button on the controller.
     *
     * @return {@code true} as long as the Z key is held down.
     */
    public boolean getZButton() {
        return this.getRawButton(1);
    }

    /**
     * Checks whether the Z button was released since the last check.
     *
     * @return {@code true} only at the time when the Z key is released.
     */
    public boolean getZButtonReleased() {
        return this.getRawButtonReleased(1);
    }

    /**
     * Checks whether the X button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the X key is pressed down.
     */
    public boolean getXButtonPressed() {
        return this.getRawButtonPressed(2);
    }

    /**
     * Reads the state of the X button on the controller.
     *
     * @return {@code true} as long as the X key is held down.
     */
    public boolean getXButton() {
        return this.getRawButton(2);
    }

    /**
     * Checks whether the X button was released since the last check.
     *
     * @return {@code true} only at the time when the X key is released.
     */
    public boolean getXButtonReleased() {
        return this.getRawButtonReleased(2);
    }

    /**
     * Checks whether the C button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the C key is pressed down.
     */
    public boolean getCButtonPressed() {
        return this.getRawButtonPressed(2);
    }

    /**
     * Reads the state of the C button on the controller.
     *
     * @return {@code true} as long as the C key is held down.
     */
    public boolean getCButton() {
        return this.getRawButton(3);
    }

    /**
     * Checks whether the C button was released since the last check.
     *
     * @return {@code true} only at the time when the C key is released.
     */
    public boolean getCButtonReleased() {
        return this.getRawButtonReleased(3);
    }

    /**
     * Checks whether the V button was pressed since the last check.
     *
     * @return {@code true} only on the initial time when the V key is pressed down.
     */
    public boolean getVButtonPressed() {
        return this.getRawButtonPressed(4);
    }

    /**
     * Reads the state of the V button on the controller.
     *
     * @return {@code true} as long as the V key is held down.
     */
    public boolean getVButton() {
        return this.getRawButton(4);
    }

    /**
     * Checks whether the V button was released since the last check.
     *
     * @return {@code true} only at the time when the V key is released.
     */
    public boolean getVButtonReleased() {
        return this.getRawButtonReleased(4);
    }

    /**
     * Gets the W/S axis value of the controller (Axis 0).
     *
     * @return The axis value for W (forward) / S (reverse) keys ({@code -1.0} to {@code 1.0}).
     */
    public double getWSAxis() {
        return this.getRawAxis(0);
    }

    /**
     * Gets the Left/Right axis value of the controller (Axis 1).
     *
     * @return The axis value for Left Arrow (left) / Right Arrow (right) keys ({@code -1.0} to
     *     {@code 1.0}).
     */
    public double getLeftRightAxis() {
        return this.getRawAxis(1);
    }
}