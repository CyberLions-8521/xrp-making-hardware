#  xrp-making-hardware
An XRP project file that allows users to instatiate objects that represents each piece of hardware.

The example drivebase has been removed; we will have to create our own.

Sample functions for the robot behaviors have been removed.

The `KeyboardController` class still exists, but it must be instantiated in order for its methods to be used.

---

# KeyboardController Class

Functions used to capture keypresses and joystick input from the keyboard controller.

## Action Buttons (Z, X, C, V)

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `KeyboardController(port)` | The port number for the controller (0 - 5) | *None* | The constructor.  Creates a WASD keyboard controller on the given port.  Only one keyboard controller can be created and used |
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



