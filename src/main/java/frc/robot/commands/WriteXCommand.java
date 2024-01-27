package frc.robot.commands;

import frc.robot.subsystems.SwerveDriveSystem;

public class WriteXCommand extends WriteAxisCommand {
    public WriteXCommand(SwerveDriveSystem swerveSystem,
            double xspeed,
            double timeOffset,
            double maxTime) {
        super(swerveSystem, xspeed, 0, 0, maxTime, timeOffset);
    }
}
