// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.AbsoluteEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.EncoderType;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxAbsoluteEncoder;
import com.revrobotics.SparkMaxAlternateEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.SparkMaxRelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxAbsoluteEncoder.Type;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class EncoderTest extends SubsystemBase {
  /** Creates a new EncoderTest. */

  private static final int kCPR = 8192;

  private CANSparkMax motor;
  private SparkMaxPIDController boring_name_pidcontroller;
  private SparkMaxAlternateEncoder Encoder;

  public EncoderTest() {
    motor = new CANSparkMax(Constants.kControls.TEST_ID, MotorType.kBrushless);
    motor.restoreFactoryDefaults();

    //Encoder = motor.getAlternateEncoder();
    
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Something Fun", Encoder.getPosition());
  }
}
