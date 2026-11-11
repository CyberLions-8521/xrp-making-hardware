#  xrp-intro-autonomous
An XRP project file for use with autonomous and teleoperated modes.  Functions for interacting with the robot have already been created.
  
#  Drive Functions

Functions used to control the movement of the robot.

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `drive(speed, turn)` | `double speed`, `double turn` | `void` | Moves the robot using arcade drive. `speed` controls forward/backward (-1.0 to 1.0) and `turn` controls rotation (-1.0 to 1.0). |
| `driveForward()` | *None* | `void` | Drives the robot straight forward at 75% speed. |
| `driveReverse()` | *None* | `void` | Drives the robot straight backward at 75% speed. |
| `stop()` | *None* | `void` | Stops all drivetrain movement immediately. |

---

# Sensor & Actuator Functions

Functions used to read telemetry from sensors or control actuators (servos).

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `resetEncoders()` | *None* | `void` | Resets the wheel encoders back to zero. |
| `getLeftDistanceInch()` | *None* | `double` | Gets total distance traveled by the left wheel in inches. |
| `getRightDistanceInch()` | *None* | `double` | Gets total distance traveled by the right wheel in inches. |
| `getHeading()` | *None* | `double` | Returns the current gyro heading angle in degrees. |
| `resetGyro()` | *None* | `void` | Resets the gyro angle reading back to 0 degrees. |
| `getServoPosition()` | *None* | `double` | Returns the current position of the connected servo. |
| `setServoPosition(pos)` | `double pos` | `void` | Sets the servo position (`0.0` to `1.0`). |
| `getUltrasonicInches()` | *None* | `double` | Reads the distance from the ultrasonic sensor in inches. |
| `getUltrasonicMeters()` | *None* | `double` | Reads the distance from the ultrasonic sensor in meters. |
| `getLeftReflectance()` | *None* | `double` | Reads the light reflectance value from the left line-following sensor. |
| `getRightReflectance()` | *None* | `double` | Reads the light reflectance value from the right line-following sensor. |

---

# Keyboard Controller Functions

Functions used to capture keypresses and joystick input from the keyboard controller.

## Action Buttons (Z, X, C, V)

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `getZButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **Z** key is pressed down. |
| `getZButton()` | *None* | `boolean` | `true` as long as the **Z** key is held down. |
| `getZButtonReleased()` | *None* | `boolean` | `true` only on the frame when **Z** key is released. |
| `getXButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **X** key is pressed down. |
| `getXButton()` | *None* | `boolean` | `true` as long as the **X** key is held down. |
| `getXButtonReleased()` | *None* | `boolean` | `true` only on the frame when **X** key is released. |
| `getCButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **C** key is pressed down. |
| `getCButton()` | *None* | `boolean` | `true` as long as the **C** key is held down. |
| `getCButtonReleased()` | *None* | `boolean` | `true` only on the frame when **C** key is released. |
| `getVButtonPressed()` | *None* | `boolean` | `true` only on the initial frame when **V** key is pressed down. |
| `getVButton()` | *None* | `boolean` | `true` as long as the **V** key is held down. |
| `getVButtonReleased()` | *None* | `boolean` | `true` only on the frame when **V** key is released. |

## Analog Axes & D-Pad

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `getWSAxis()` | *None* | `double` | Returns axis value for **W** (forward) / **S** (reverse) keys (`-1.0` to `1.0`). |
| `getADAxis()` | *None* | `double` | Returns axis value for **A** (left) / **D** (right) keys (`-1.0` to `1.0`). |
| `getERAxis()` | *None* | `double` | Returns axis value for **E** / **R** keys (`-1.0` to `1.0`). |
| `getPOV()` | *None* | `int` | Returns the current POV angle in degrees (e.g., `0`, `90`, `180`, `270`), or `-1` if centered. |



