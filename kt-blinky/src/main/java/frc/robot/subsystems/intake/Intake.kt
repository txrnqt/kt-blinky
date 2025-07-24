package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.Commands
import edu.wpi.first.wpilibj2.command.SubsystemBase

class Intake(private var io: IntakeIO) : SubsystemBase() {

    fun intakeCMD(volts: Double): Command =
        Commands.runEnd({io.setVoltage(volts)}, {io.setVoltage(0.0)})
}