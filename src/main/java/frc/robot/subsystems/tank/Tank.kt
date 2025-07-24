package frc.robot.subsystems.tank

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.Commands
import edu.wpi.first.wpilibj2.command.SubsystemBase
import edu.wpi.first.wpilibj2.command.button.CommandXboxController

class Tank(private val io: TankIO) : SubsystemBase() {

    fun driveCMD(controller: CommandXboxController): Command {
        return Commands.run(
            {io.setVoltage(controller.leftY * 12.0, controller.leftX * 12.0)})
    }

}