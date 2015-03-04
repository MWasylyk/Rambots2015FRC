package org.usfirst.frc.team1350.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static final int TOP_LIMIT_SWITCH = 0;
    public static final int BOTTOM_LIMIT_SWITCH = 1;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static final int DRIVE_TRAIN_LEFT_MOTOR_CONTROLLER = 0;
	public static final int DRIVE_TRAIN_RIGHT_MOTOR_CONTROLLER = 1;

    public static final int LIFT_MOTOR = 2;

    public static final int LIFT_CRATE_UP_BUTTON = 6;
    public static final int LIFT_BIN_UP_BUTTON = 11;
    public static final int LIFT_DOWN_BUTTON = 7;


    // USB PORT?
	public static final int JOYSTICK_LEFT_PORT = 2;
	public static final int JOYSTICK_RIGHT_PORT = 3;

}
