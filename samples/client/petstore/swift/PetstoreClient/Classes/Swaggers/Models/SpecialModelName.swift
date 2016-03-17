//
// SpecialModelName.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SpecialModelName: JSONEncodable {

    public var specialPropertyName: Int64?
    

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["$special[property.name]"] = self.specialPropertyName != nil ? NSNumber(longLong: self.specialPropertyName!) : nil
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
