#  xrp-making-hardware
An XRP project file that allows users to instatiate objects that represents each piece of hardware.

The example drivebase has been removed; we will have to create our own.

Sample functions for the robot behaviors have been removed.

The `KeyboardController` class still exists, but it must be instantiated in order for its methods to be used.

---

# WASDController Class

Functions used to capture keypresses and joystick input from the keyboard controller.

## WASD Action Buttons (Z, X, C, V)

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `WASDController(port)` | The port number for the controller (0 - 5) | *None* | The constructor.  Creates a WASD keyboard controller on the given port.  Only one WASD controller can be created and used |
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

## WASD Analog Axes & D-Pad

| Function | Parameters | Return Type | Description |
| :--- | :--- | :--- | :--- |
| `getWSAxis()` | *None* | `double` | Returns axis value for **W** (forward) / **S** (reverse) keys (`-1.0` to `1.0`). |
| `getADAxis()` | *None* | `double` | Returns axis value for **A** (left) / **D** (right) keys (`-1.0` to `1.0`). |
| `getERAxis()` | *None* | `double` | Returns axis value for **E** / **R** keys (`-1.0` to `1.0`). |
| `getPOV()` | *None* | `int` | Returns the current POV angle in degrees (e.g., `0`, `90`, `180`, `270`), or `-1` if centered. |

# IKUpDownController Class

Functions used to capture keypresses and joystick input from the IK/Up-Down keyboard controller.

## IK/Up-Down Action Buttons (U, O, J, L)

| Function | Return Type | Description |
| :--- | :--- | :--- |
| `IKUpDownController(port)` | *None* | The constructor.  Creates an IK/Up-Down keyboard controller on the given port (0 - 5). |
| `getUButtonPressed()` | `boolean` | `true` only on the initial frame when **U** key is pressed down. |
| `getUButton()` | `boolean` | `true` as long as the **U** key is held down. |
| `getUButtonReleased()` | `boolean` | `true` only on the frame when **U** key is released. |
| `getOButtonPressed()` | `boolean` | `true` only on the initial frame when **O** key is pressed down. |
| `getOButton()` | `boolean` | `true` as long as the **O** key is held down. |
| `getOButtonReleased()` | `boolean` | `true` only on the frame when **O** key is released. |
| `getJButtonPressed()` | `boolean` | `true` only on the initial frame when **J** key is pressed down. |
| `getJButton()` | `boolean` | `true` as long as the **J** key is held down. |
| `getJButtonReleased()` | `boolean` | `true` only on the frame when **J** key is released. |
| `getLButtonPressed()` | `boolean` | `true` only on the initial frame when **L** key is pressed down. |
| `getLButton()` | `boolean` | `true` as long as the **L** key is held down. |
| `getLButtonReleased()` | `boolean` | `true` only on the frame when **L** key is released. |

## IK/Up-Down Analog Axes

| Function | Return Type | Description |
| :--- | :--- | :--- |
| `getIKAxis()` | `double` | Returns axis value for **I** / **K** keys (`-1.0` to `1.0`). |
| `getUpDownAxis()` | `double` | Returns axis value for **Up Arrow** / **Down Arrow** keys (`-1.0` to `1.0`). |

