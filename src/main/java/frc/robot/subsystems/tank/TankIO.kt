package frc.robot.subsystems.tank

interface TankIO {

    class TankInputs() {}

    fun setVoltage(lVolts: Double, rVolts: Double){}

    fun updateInputs(inputs: TankInputs) {}
}