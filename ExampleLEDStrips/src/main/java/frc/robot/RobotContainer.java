// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.lasarobotics.led.LEDStrip;
import org.lasarobotics.led.LEDSubsystem;
import org.lasarobotics.led.LEDStrip.Pattern;
import org.lasarobotics.led.LEDStrip.Section;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  private static final LEDSubsystem LED_SUBSYSTEM = LEDSubsystem.getInstance();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();

    // Led Example
    LEDStrip strip = new LEDStrip(LEDStrip.initializeHardware(Constants.LEDHardware.LED_STRIP_ID));
    strip.set(Pattern.BLUE_SOLID);
    strip.set(Pattern.ORANGE_WAVE, Section.MIDDLE);
    LED_SUBSYSTEM.add(strip);
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {}

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
