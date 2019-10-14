import java.util.Date;
import java.util.UUID;

public interface AlertDAO {
    public UUID addAlert(Date time);

    public Date getAlert(UUID id);
}
