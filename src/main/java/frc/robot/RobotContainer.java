// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.subsystems.DriveTrain;

/** Add your docs here. */
public class RobotContainer {
    private static Joystick joy = new Joystick(RobotMap.joy);
    private static Joystick joy1 = new Joystick(RobotMap.joy1);
    private static DriveTrain drive = new DriveTrain();

    public static Joystick getJoy(){
        return joy;
    }

    public static Joystick getJoy1(){
        return joy1;
    }

    public static DriveTrain getDrive(){
        return drive;
    }
}
