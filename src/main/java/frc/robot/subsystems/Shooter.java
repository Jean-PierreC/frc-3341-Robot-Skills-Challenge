// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;
import frc.robot.RobotContainer;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.Ultrasonic;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  private TalonSRX shot = new TalonSRX(RobotMap.Button1);
  private static Shooter instance;

  public Shooter() {

  }
public static Shooter getInstance(){
    if(instance == null){
      instance = new Shooter();
    }
    return instance;
  }
//public void Shooter(doulbe sPower){
 // shot.set(ControlMode.PercentOutput, sPower);
//}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    if (RobotContainer.getButton1().equals(true)) {
      shot.set(ControlMode.PercentOutput, .3);
    }
    shot.set(ControlMode.PercentOutput, 0);

   // shooter(RobotContainer.getButton1().whenPressed(shot.)
  }
}
