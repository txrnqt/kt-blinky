package frc.robot.subsystems.intake

import edu.wpi.first.units.Units
import edu.wpi.first.units.measure.Voltage
import org.littletonrobotics.junction.AutoLog

interface IntakeIO {

    @AutoLog
    class IntakeInputs {
        val leftVoltage = Units.Volts.of(0.0);
    }

    fun setVoltage(volts: Double) {}

    fun updateInputs(inputs: IntakeInputs) {}
}