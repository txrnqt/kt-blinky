package frc.robot.subsystems.intake

interface IntakeIO {

    class IntakeInputs() {}

    fun setVoltage(volts: Double) {}

    fun updateInputs(inputs: IntakeInputs) {}
}