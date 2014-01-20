package org.graylog2.shared;

import com.codahale.metrics.MetricRegistry;
import org.graylog2.plugin.buffers.Buffer;
import org.graylog2.plugin.filters.MessageFilter;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Dennis Oelkers <dennis@torch.sh>
 */
public interface ProcessingHost {
    public List<MessageFilter> getFilters();
    public Buffer getOutputBuffer();
    public AtomicInteger processBufferWatermark();
    public MetricRegistry metrics();
    public String getNodeId();
    public boolean isProcessing();

    public boolean isServer();
    public boolean isRadio();
}
