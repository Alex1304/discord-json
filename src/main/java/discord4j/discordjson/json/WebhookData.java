package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableWebhookData.class)
@JsonDeserialize(as = ImmutableWebhookData.class)
public interface WebhookData {

    String id();

    int type();

    @JsonProperty("guild_id")
    default Possible<String> guildId() { return Possible.absent(); }

    @JsonProperty("channel_id")
    String channelId();

    default Possible<UserData> user() { return Possible.absent(); }

    Optional<String> name();

    Optional<String> avatar();

    default Possible<String> token() { return Possible.absent(); }
}
