/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2013, FrostWire(R). All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.frostwire.android.core.player;

import com.frostwire.android.core.FileDescriptor;

/**
 * @author gubatron
 * @author aldenml
 *
 */
public interface CoreMediaPlayer {

    public void play(Playlist playlist);

    public void stop();

    public void shutdown();

    public boolean isPlaying();
    
    /**
     * The current file the media player is playing.
     * 
     * @return
     */
    public FileDescriptor getCurrentFD();
}
