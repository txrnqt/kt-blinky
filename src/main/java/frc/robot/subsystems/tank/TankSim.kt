package frc.robot.subsystems.tank

import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim

class TankSim(private val simulation : DifferentialDrivetrainSim) : TankIO{
    override fun setVoltage(lVolts: Double, rVolts: Double) {
        simulation.setInputs(lVolts, rVolts)
    }

    override fun updateInputs(inputs: TankIO.TankInputs) {}
}