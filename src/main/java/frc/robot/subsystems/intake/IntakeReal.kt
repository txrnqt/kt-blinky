package frc.robot.subsystems.intake

import edu.wpi.first.wpilibj.motorcontrol.Victor
import edu.wpi.first.wpilibj.motorcontrol.VictorSP
import frc.robot.subsystems.intake.IntakeIO.IntakeInputs

class IntakeReal : IntakeIO {

    private val intakeLeft = VictorSP(1)
    private val intakeRight = VictorSP(2)

    init {
        intakeRight.inverted = true
    }

    override fun setVoltage(volts: Double) {
        intakeLeft.voltage = volts
        intakeRight.voltage = volts
    }

    override fun updateInputs(inputs: IntakeInputs) {}
}