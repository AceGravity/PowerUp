package org.usfirst.frc.team3946.robot.commands;

import org.usfirst.frc.team3946.robot.subsystems.LED;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LightTeamColor extends Command {

    public LightTeamColor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	LED.setTeamColor(true);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	LED.setTeamColor(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
