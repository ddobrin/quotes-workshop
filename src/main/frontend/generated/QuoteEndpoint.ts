import { EndpointRequestInit as EndpointRequestInit_1 } from "@vaadin/hilla-frontend";
import type Quote_1 from "./com/example/quotes/domain/Quote.js";
import type Filter_1 from "./com/vaadin/hilla/crud/filter/Filter.js";
import type Pageable_1 from "./com/vaadin/hilla/mappedtypes/Pageable.js";
import client_1 from "./connect-client.default.js";
async function allQuotes_1(init?: EndpointRequestInit_1): Promise<Array<Quote_1>> { return client_1.call("QuoteEndpoint", "allQuotes", {}, init); }
async function delete_1(id: number, init?: EndpointRequestInit_1): Promise<void> { return client_1.call("QuoteEndpoint", "delete", { id }, init); }
async function init_1(init?: EndpointRequestInit_1): Promise<void> { return client_1.call("QuoteEndpoint", "init", {}, init); }
async function list_1(pageable: Pageable_1, filter: Filter_1 | undefined, init?: EndpointRequestInit_1): Promise<Array<Quote_1>> { return client_1.call("QuoteEndpoint", "list", { pageable, filter }, init); }
async function quoteByAuthor_1(author: string, init?: EndpointRequestInit_1): Promise<Array<Quote_1>> { return client_1.call("QuoteEndpoint", "quoteByAuthor", { author }, init); }
async function randomQuote_1(init?: EndpointRequestInit_1): Promise<Quote_1> { return client_1.call("QuoteEndpoint", "randomQuote", {}, init); }
async function save_1(quote: Quote_1, init?: EndpointRequestInit_1): Promise<Quote_1> { return client_1.call("QuoteEndpoint", "save", { quote }, init); }
export { allQuotes_1 as allQuotes, delete_1 as delete, init_1 as init, list_1 as list, quoteByAuthor_1 as quoteByAuthor, randomQuote_1 as randomQuote, save_1 as save };
