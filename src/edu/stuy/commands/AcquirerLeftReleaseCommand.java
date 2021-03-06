package edu.stuy.commands;

import edu.stuy.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Runs the left acquirer wheel outward to release
 */
public class AcquirerLeftReleaseCommand extends Command {

    public AcquirerLeftReleaseCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.leftAcquirer);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.leftAcquirer.release();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
