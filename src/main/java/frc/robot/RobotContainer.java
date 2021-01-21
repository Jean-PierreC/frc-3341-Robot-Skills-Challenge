// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;

/** Add your docs here. */
public class RobotContainer {
    private static Joystick joy = new Joystick(RobotMap.joy);
    private static Joystick joy1 = new Joystick(RobotMap.joy1);
    private static JoystickButton Button1 = new JoystickButton(joy, RobotMap.Button1);
    private static DriveTrain drive = new DriveTrain();
    private static Shooter shoot = new Shooter();

    public static Joystick getJoy(){
        return joy;
    }

    public static Joystick getJoy1(){
        return joy1;
    }

    public static DriveTrain getDrive(){
        return drive;
    }

    public static Shooter getShoot(){
        return shoot;
    }

    public static JoystickButton getButton1(){
        return Button1;
    }
}
