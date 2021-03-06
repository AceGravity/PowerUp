package org.usfirst.frc.team3946.robot.commands;

import org.usfirst.frc.team3946.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClosedIntakeArm extends Command {

    public ClosedIntakeArm() {
    	requires(Robot.intake);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.intake.leftServoAngle() > 0) {
    		Robot.intake.setIntakeSpeed(-.5);
    	} else {
    		Robot.intake.setIntakeSpeed(0);
    	}
    	if(Robot.intake.rightServoAngle() > 0) {
    		Robot.intake.setIntakeSpeed(-.5);
    	} else {
    		Robot.intake.setIntakeSpeed(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
