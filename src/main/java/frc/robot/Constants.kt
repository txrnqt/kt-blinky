package frc.robot


import edu.wpi.first.units.Units.Inches
import edu.wpi.first.units.Units.Pounds
import edu.wpi.first.units.measure.Distance
import edu.wpi.first.units.measure.Mass
import org.ironmaple.simulation.drivesims.COTS
import org.ironmaple.simulation.drivesims.configs.DriveTrainSimulationConfig

class Constants {



    object simConstants {
        val robotMass: Mass = Pounds.of(10.0);
        val bumberFront: Distance = Inches.of(10.0);
        val bumberRight: Distance = Inches.of(10.0);
        val trackXLength: Distance = Inches.of(10.0);
        val trackYLength: Distance = Inches.of(10.0);

        fun getMapleConfig() : DriveTrainSimulationConfig {
            return DriveTrainSimulationConfig.Default().withRobotMass(robotMass).withGyro(COTS.ofNav2X())
                .withBumperSize(bumberFront.times(2.0), bumberRight.times(2.0))
                .withTrackLengthTrackWidth(trackXLength, trackYLength)
        }
    }
}