package frc.robot.subsystems.tank

import edu.wpi.first.wpilibj.motorcontrol.VictorSP

class TankReal : TankIO {
    private val leftLead = VictorSP(0)
    private val leftFollow = VictorSP(0)
    private val rightLead = VictorSP(0)
    private val rightFollow = VictorSP(0)

    init {
        leftLead.addFollower(leftFollow)
        rightLead.addFollower(rightFollow)
    }

    override fun setVoltage(lVolts: Double, rVolts: Double) {
        leftLead.voltage = lVolts
        rightLead.voltage = rVolts
    }

    override fun updateInputs(inputs: TankIO.TankInputs) {}
}