package frc.robot

import edu.wpi.first.math.geometry.Pose2d
import edu.wpi.first.math.geometry.Rotation2d
import edu.wpi.first.wpilibj.simulation.DifferentialDrivetrainSim
import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import frc.robot.subsystems.intake.Intake
import frc.robot.subsystems.intake.IntakeReal
import frc.robot.subsystems.intake.IntakeReplay
import frc.robot.subsystems.intake.IntakeSim
import frc.robot.subsystems.tank.Tank
import frc.robot.subsystems.tank.TankReal
import frc.robot.subsystems.tank.TankReplay
import frc.robot.subsystems.tank.TankSim
import org.ironmaple.simulation.SimulatedArena
import org.ironmaple.simulation.drivesims.AbstractDriveTrainSimulation


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the [Robot]
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 *
 * In Kotlin, it is recommended that all your Subsystems are Kotlin objects. As such, there
 * can only ever be a single instance. This eliminates the need to create reference variables
 * to the various subsystems in this container to pass into to commands. The commands can just
 * directly reference the (single instance of the) object.
 */
object RobotContainer {
    val robotRunType = Robot.robotRunType
    private val driverController = CommandXboxController(0);

    var blueStart: Pose2d = Pose2d(7.247, 1.126, Rotation2d(2.276))
    var redStart: Pose2d = Pose2d(10.025, 3.476, Rotation2d(0.0))

    private  lateinit var tank : Tank
    private lateinit var intake: Intake

    init
    {
        when(robotRunType) {
            Robot.RobotRunType.kReal -> {
                intake = Intake(IntakeReal())
                tank = Tank(TankReal())
            }
            Robot.RobotRunType.kSimulation -> {
//                val driveSim = AbstractDriveTrainSimulation(Constants.simConstants.getMapleConfig(), redStart)
//                SimulatedArena.getInstance().addDriveTrainSimulation(driveSim)
                intake = Intake(IntakeSim())
//                tank = Tank(TankSim(driveSim))
            }
            Robot.RobotRunType.kReplay -> {
                intake = Intake(IntakeReplay())
                tank = Tank(TankReplay())
            }
        }

        configureBindings()
    }

    /** Use this method to define your `trigger->command` mappings. */
    private fun configureBindings()  {
        driverController.b().onTrue(intake.intakeCMD(5.0))
        driverController.a().onTrue(intake.intakeCMD(-5.0))
    }

    fun getAutonomousCommand(): Command? {
        // TODO: Implement properly
        return null
    }
}