package android.os;

/** {@hide} */
interface IGpioService
{
	/**
	 *	GPIO output control
	 */
	int gpioWrite(int gpio, int value) = 0;
	/**
	 *	Read GPIO data
	 */
	int gpioRead(int gpio) = 1;
	/**
	 *	GPIO direction control
	 */
	int gpioDirection(int gpio, int direction, int value) = 2;
	/**
	 *	Registration GPIO interrupt (key event) in Input mode.
	 */
	int gpioRegKeyEvent(int gpio) = 3;
	/**
	 *	Unregister input mode GPIO interrupt (key event).
	 */
	int gpioUnregKeyEvent(int gpio) = 4;
	/**
	 *	Check the number of available GPIOs.
	 */
	int gpioGetNumber() = 5;
}
