package org.usfirst.frc.team3946.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class RightSwitchAutonomous extends CommandGroup {

    public RightSwitchAutonomous() {
        // Add Commands here:
    	addSequential(new AutoRightTurn());
    	addSequential(new AutoStraight());
    	addSequential(new AutoLeftTurn());
    	addSequential(new AutoStraight());
    	addSequential(new AutoLeftTurn());
//    	addSequential(new SwitchPosition());
//    	setTimeout(1);
//    	addSequential(new Release());
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
