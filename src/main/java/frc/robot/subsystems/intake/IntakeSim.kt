package frc.robot.subsystems.intake

import edu.wpi.first.math.system.plant.DCMotor
import edu.wpi.first.math.system.plant.LinearSystemId
import edu.wpi.first.wpilibj.simulation.DCMotorSim
import frc.robot.subsystems.intake.IntakeIO.IntakeInputs

class IntakeSim : IntakeIO {
    private val intakeMotors = DCMotorSim(LinearSystemId.createDCMotorSystem(.5,.5),
        DCMotor.getCIM(2))

    override fun setVoltage(volts: Double) {
        intakeMotors.inputVoltage = volts;
    }

    override fun updateInputs(inputs: IntakeInputs) {}
}