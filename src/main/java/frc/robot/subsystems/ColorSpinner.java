/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ColorSpinner extends SubsystemBase {
  private PWMVictorSPX spinner = new PWMVictorSPX(Constants.SPINNER_PORT);

  public void setSpinner(double speed) {
    spinner.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
