/*
 * Copyright 2018 Automatad
 * This file maps the AVRO Schema to Divolte
 * File created on Nov 5 2018
 * vamsi@automatad.com
 */

mapping {
    map duplicate() onto 'isDuplicate'
    map corrupt() onto 'isCorrupt'
    map firstInSession() onto 'isFirstInSession'
    map timestamp() onto 'timestamp'
    map clientTimestamp() onto 'clientTimestamp'
    map remoteHost() onto 'remoteHost'
    map referer() onto 'referer'
    map location() onto 'location'
    map viewportPixelWidth() onto 'viewportPixelWidth'
    map viewportPixelHeight() onto 'viewportPixelHeight'
    map screenPixelWidth() onto 'screenPixelWidth'
    map screenPixelHeight() onto 'screenPixelHeight'
    map partyId() onto 'partyId'
    map sessionId() onto 'sessionId'
    map pageViewId() onto 'pageViewId'
    map eventType() onto 'eventType'

    map userAgentString() onto 'userAgentString'
    def ua = userAgent()
    map ua.name() onto 'userAgentName'
    map ua.family() onto 'userAgentFamily'
    map ua.vendor() onto 'userAgentVendor'
    map ua.type() onto 'userAgentType'
    map ua.version() onto 'userAgentVersion'
    map ua.deviceCategory() onto 'userAgentDeviceCategory'
    map ua.osFamily() onto 'userAgentOsFamily'
    map ua.osVersion() onto 'userAgentOsVersion'
    map ua.osVendor() onto 'userAgentOsVendor'

    def geo = ip2geo()
    map geo.cityId() onto 'cityId'
    map geo.cityName() onto 'cityName'
    map geo.continentCode() onto 'continentCode'
    map geo.continentId() onto 'continentId'
    map geo.continentName() onto 'continentName'
    map geo.countryCode() onto 'countryCode'
    map geo.countryId() onto 'countryId'
    map geo.countryName() onto 'countryName'
    map geo.latitude() onto 'latitude'
    map geo.longitude() onto 'longitude'
    map geo.timeZone() onto 'timeZone'

    map eventParameters().value('schemaVer') onto 'schemaVersion'
    map eventParameters().value('tagId') onto 'tagId'
    map eventParameters().value('storyId') onto 'storyId'
    map eventParameters().value('frameId') onto 'frameId'
    map eventParameters().value('thumbnailId') onto 'thumbnailId'
    map eventParameters().value('tapId') onto 'tapId'
    map eventParameters().value('touchPoint') onto 'touchPoint'
    map eventParameters().value('productType') onto 'productType'
    map { parse eventParameters().value('seconds') to int64 } onto 'seconds'
    map { parse eventParameters().value('mute') to int32 } onto 'mute'
}